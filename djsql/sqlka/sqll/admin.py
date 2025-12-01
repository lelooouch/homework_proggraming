from django.contrib import admin

# Register your models here.

from .models import People, Starships

@admin.register(People)
class PeopleAdmin(admin.ModelAdmin):
    list_display = ('name', 'height', 'mass', 'hair_color', 'skin_color',
                    'eye_color', 'birth_year', 'gender', 'homeworld')
    list_filter = ('gender', 'homeworld')
    search_fields = ('name', 'homeworld')
    
@admin.register(Starships)
class PeopleAdmin(admin.ModelAdmin):
    list_display = ('name', 'model')
    
