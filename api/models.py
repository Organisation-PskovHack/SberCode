from django.db import models


class Task(models.Model):
    title = models.CharField("Название", max_length=130)
    is_ready = models.BooleanField("Выполнено?", default=False, blank=False)

    class Meta:
        verbose_name = "Задачу"
        verbose_name_plural = "Задачи"
