import requests
import sqlite3
import json


def send_req(url):
    response = requests.get(url)
    if response.status_code == 200:
        return response.json()
    return None

def parse():
    data_list = list()
    for i in range(1, 83):
        data = send_req(f'https://swapi.dev/api/people/{i}')
        if data:
            data_list.append(data)
    return data_list

def save_data(data):
    with open('data.json', mode = 'w', encoding='utf-8') as file:
        json.dump(data, file)


def update_data(data):
    
    data_data = []
    for index, el in enumerate(data):
        data_dict = {}
        el['homeworld'] = send_req(el['homeworld'])['name']
        
        del el['films']
        del el['species']
        del el['vehicles']
        del el['starships']
        del el['created']
        del el['edited']
        del el['url']
        
        data_dict['model'] = "sqll.people"
        data_dict['pk'] = index + 1
        data_dict['fields'] = el
        data_data.append(data_dict)

    return data_data


def main():
    data = parse()
    data = update_data(data)
    save_data(data)


if __name__ == '__main__':
    main()