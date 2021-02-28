from django.urls import path
from .views import *

app_name = "api"

urlpatterns = [
    path("list/", TaskList.as_view()),
    path("delete/", TaskDelete.as_view()),
    path("edit/", TaskEdit.as_view()),
    path("complete/", TaskComplete.as_view()),
    path("create/", TaskCreate.as_view()),
]