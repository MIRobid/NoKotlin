package com.example.android.nokotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Создать новый проект в Android Studio без поддержки Kotlin.
 * Сконфигурировать Kotlin в новом проекте (лучше вручную).
 * Перевести MainActivity на Kotlin.
 * Добавить кнопку в разметку и повесить на неё clickListener в Activity.
 * Потренироваться в создании классов и функций, описанных в уроке, и убедиться, что всё работает. К примеру, создайте тестовое приложение:
 * создайте data class с двумя свойствами, выведите их на экран приложения;
 * создайте Object, в Object вызывайте copy и выводите значения скопированного класса на экран;
 * выводите значения из разных циклов в консоль, используя примеры из методических материалов.
 * Изучить API погоды Яндекса, посмотреть примеры и зарегистрироваться в качестве разработчика, получить свой ключ разработчика.
 * Изучить API базы данных с фильмами и зарегистрироваться в качестве разработчика, получить свой ключ разработчика.
 * Определиться с экранами и функционалом вашего будущего приложения с фильмами на основе возможностей API.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}