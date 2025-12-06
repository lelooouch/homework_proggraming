from django.db import models

# Create your models here.


class People(models.Model):
    name = models.CharField(max_length=100)
    height = models.CharField(max_length=100, blank=True, null=True)
    mass = models.CharField(max_length=100, blank=True, null=True)
    hair_color = models.CharField(max_length=100)
    skin_color = models.CharField(max_length=100)
    eye_color = models.CharField(max_length=100)
    birth_year = models.CharField(max_length=100)
    gender = models.CharField(max_length=100)
    homeworld = models.CharField(max_length=100, blank=True, null=True)
    # films = models.CharField(max_length=200)
    # species = models.CharField(max_length=200)
    # vehicles = models.CharField(max_length=200)
    # starships = models.CharField(max_length=200)
    
    def __str__(self) -> str:
        return self.name
    
    
class Starships(models.Model):
    name = models.CharField(max_length=128)
    model = models.CharField(max_length=128)
    manufacturer = models.CharField(max_length=250)
    cost_in_credits = models.CharField(max_length=128)
    length = models.CharField(max_length=128)
    max_atmosphering_speed = models.CharField(max_length=128)
    crew = models.CharField(max_length=128)
    passengers = models.CharField(max_length=128)
    cargo_capacity = models.CharField(max_length=128)
    consumables = models.CharField(max_length=128)
    hyperdrive_rating = models.CharField(max_length=128)
    MGLT = models.CharField(max_length=128)
    starship_class = models.CharField(max_length=128)
    pilots = models.ManyToManyField(People, related_name='starships')

    def __str__(self):
        return self.name