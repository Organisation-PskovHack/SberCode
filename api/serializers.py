from rest_framework import serializers
from .models import Task


class TaskListSerializer(serializers.ModelSerializer):
    model = Task
    fields = "__all__"
