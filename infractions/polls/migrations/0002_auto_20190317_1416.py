# Generated by Django 2.1.6 on 2019-03-17 14:16

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('polls', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='actor',
            name='actor_name',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='polls.Movie'),
        ),
    ]
