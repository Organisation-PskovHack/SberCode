from rest_framework.response import Response
from rest_framework.views import APIView

from .models import Task
from .serializers import TaskListSerializer


class TaskList(APIView):

    def get(self, request):
        tasks = Task.objects.all()
        data = []
        for task in tasks:
            data.append(
                {
                    "id": task.id,
                    "title": task.title,
                    "active": task.is_ready,
                }
            )

        return Response({
            "tasks": data,
        })


class TaskCreate(APIView):

    def post(self, request):
        data = request.data
        if data.get("title"):
            task = Task()
            task.title = data.get("title")
            task.is_ready = False
            task.save()
        return Response(status=201)


class TaskDelete(APIView):

    def post(self, request):
        Task.objects.get(id=request.data.get("id")).delete()
        return Response(status=201)


class TaskComplete(APIView):

    def post(self, request):
        task = Task.objects.get(id=request.data.get("id"))
        task.is_ready = True
        task.save()
        return  Response(status=200)


class TaskEdit(APIView):

    def post(self, request):
        task = Task.objects.get(id=request.data.get("id"))
        task.is_ready = request.data.get("title")
        task.save()
        return Response(status=200)