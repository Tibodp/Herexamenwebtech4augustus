from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse
from .models import Movie
from .models import Actor
import string
import json

json_data = '{"a": 1, "b": 2, "c": 3, "d": 4, "e": 5}'

parsed_json = (json.loads(json_data))
print(json.dumps(parsed_json, indent=4, sort_keys=True))


def index(request):
    movie_name = [m.movie_name for m in Movie.objects.all()]

    return render(request, 'polls/index.html', {'movie_name': movie_name})

# data1 = json.load(json_data)  # deserialises it
# data2 = json.dumps(data1)  # json formatted string

# json_data.close()
