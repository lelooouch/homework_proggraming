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
    cost_in_credits = models.IntegerField()
    length = models.IntegerField()
    max_atmosphering_speed = models.IntegerField()
    crew = models.IntegerField()
    passengers = models.IntegerField()
    cargo_capacity = models.IntegerField()
    consumables = models.CharField(max_length=128)
    hyperdrive_rating = models.IntegerField()
    MGLT = models.IntegerField()
    starship_class = models.CharField(max_length=128)
    pilots = models.CharField(max_length=128)
    films = models.CharField(max_length=128)
    
    def __str__(self):
        return self.name