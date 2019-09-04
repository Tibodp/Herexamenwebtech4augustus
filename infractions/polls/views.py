from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse
from .models import Movie
from .models import Actor
import string
import json

json_data = open('/infraction.json')

parsed_json = (json.loads(json_data))
print(json.dumps(parsed_json, indent=4, sort_keys=True))


# data1 = json.load(json_data)  # deserialises it
# data2 = json.dumps(data1)  # json formatted string

# json_data.close()
