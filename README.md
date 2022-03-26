# Software engineering - Sorting Madness Project

Authors: Jan Chlebek, Jan Bylicki, Ryszard Dotka

An application used to sort sets of data with different algorithms. It is intended to help the user to assess which method may work best in specific cases and, of course, to sort the data. Numeric data are sorted by standard methods, while text data are sorted lexicographically. At least 6 different sorting methods should be implemented. The application will be available as a remote API, so that it can be integrated into existing tools. The project compiles automatically and produces javadoc documentation available in Github Pages. It also includes relevant backlogs in Polish.

# Sample input:

* Simple data structures
```
POST http://localhost:8080/sort/simple
Content-Type: application/json

{
  "simpleList": ["3794", "3793", "3792"],
  "noIter": 1000,
  "algorithm": "BogoSort",
  "isReversed": false
}
```

* Nested data structures

```
POST http://localhost:8080/sort/nested
Content-Type: application/json

{
      "nestedList": [["2","5","3"], ["1","8","2"]],
      "column": 0,
      "noIter": -1,
      "algorithm": "QuickSort",
      "isReversed": false
}
```
# Inżynieria Oprogramowania - Projekt Sorting Madness
Aplikacja służąca do sortowania zbiorów danych różnymi algorytmami. Ma pomóc użytkownikowi w ocenie, która metoda może się najlepiej sprawdzić w konkretnych przypadkach oraz, oczywiście, w uporządkowaniu danych. Dane liczbowe są sortowane standardowo, natomiast tekstowe - leksykograficznie. Należy zaimplementować co najmniej 6 różnych metod sortowania. Aplikacja będzie dostępna jako zdalne API, dzięki czemu można zintegrować z istniejącymi narzędziami. Projekt kompiluje się automatycznie oraz tworzy dokumentację javadoc dostępną w Github Pages. Zawiera także odpowiednie backlogi.

Autorzy: Jan Chlebek, Jan Bylicki, Ryszard Dotka

# Szybki dostęp (PL):
* [Product Backlog](https://github.com/Koralovy/PUT-INF5-IO-Project/wiki/Product-Backlog)
* [Sprint Backlog #1](https://github.com/Koralovy/PUT-INF5-IO-Project/wiki/Sprint-Backlog-%231)
* [Sprint Backlog #2](https://github.com/Koralovy/PUT-INF5-IO-Project/wiki/Sprint-Backlog-%232)
* [DoD](https://docs.google.com/spreadsheets/d/e/2PACX-1vTn6j3M8pmGEzrsQk8mXse7lVHUdhYWkfxbkQiYI23rBtwM4N3bWw0qtupW-gesfCkcYasnZ-eEXl-F/pubhtml#)
* [Dokumentacja javadoc](https://koralovy.github.io/PUT-INF5-IO-Project/)
