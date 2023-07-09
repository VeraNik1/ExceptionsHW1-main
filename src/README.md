README.md

# HOMEWORK №1

В данном репозитории представлены примеры кода на языке Java. Каждый пример решает определенную задачу и содержит соответствующие комментарии для лучшего понимания.

## task 1
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

[**ThreeExceptions**](https://github.com/VeraNik1/ExceptionsHW1-main/blob/master/src/ThreeExceptions.java)

**ThreeExceptions** содержит методы, которые генерируют различные типы исключений, 
такие как **NullPointerException**, **IndexOutOfBoundsException** и **ArithmeticException**. 
В каждом методе реализована попытка выполнить определенное действие, 
которое приводит к генерации соответствующего исключения.

### Результат выполнения
```
NullPointerException: Cannot invoke "String.length()" because "str" is null
IndexOutOfBoundsException: Index 5 out of bounds for length 3
ArithmeticException: / by zero

Process finished with exit code 0
```




## task2
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
```java
public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
        }
    }
    return sum;
}
```
В представленном коде можно получить следующие типы исключений:

1. **NumberFormatException**: Метод `Integer.parseInt()` 
вызывается для преобразования строки в целое число.
Если строка не может быть корректно преобразована в число, 
будет сгенерировано исключение `NumberFormatException`.

2. **ArrayIndexOutOfBoundsException**:
Во внутреннем цикле `for`, если значение переменной `j` 
превышает количество столбцов (`5`), то обращение 
к элементу `arr[i][j]` будет выходить за границы массива `arr` и вызовет исключение `ArrayIndexOutOfBoundsException`.

3. **NullPointerException**: 
Если переменная `arr` имеет значение `null` или 
один из элементов массива `arr[i]` равен `null`, то при
попытке обратиться к `arr[i][j]` будет сгенерировано исключение `NullPointerException`.

## task 3 - Вычитание элементов массивов
Реализуйте метод, принимающий в качестве аргументов 
два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов 
двух входящих массивов в той же ячейке. Если длины 
массивов не равны, необходимо как-то оповестить пользователя.


Класс [**ArraysSubtraction.java**](https://github.com/VeraNik1/ExceptionsHW1-main/blob/master/src/ArraysSubtraction.java) содержит метод **subtractArrays**, 
который принимает в качестве аргументов два целочисленных 
массива и возвращает новый массив, 
каждый элемент которого равен разности элементов 
двух входящих массивов в той же ячейке. 
Если длины массивов не равны, генерируется исключение **IllegalArgumentException**.

### Пример 1

```java
int[] array1 = {5, 10, 13, 5, 4};
int[] array2 = {0, 20, 12, 8, 9};

try {
    int[] result = SubtractArrays.subtractArrays(array1, array2);
    System.out.println("Результат вычитания массивов: " + Arrays.toString(result));
} catch (IllegalArgumentException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```
### Результат 1

```
[5, -10, 1, -3, -5]

Process finished with exit code 0
```
### Пример 2

```java
int[] array1 = {5, 10, 13, 5, 4};
int[] array2 = {0, 20, 12, 8};

try {
    int[] result = SubtractArrays.subtractArrays(array1, array2);
    System.out.println("Результат вычитания массивов: " + Arrays.toString(result));
} catch (IllegalArgumentException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```
### Результат 2

```
Ошибка: Невозможно выполнить вычитание, длины массивов не совпадают

Process finished with exit code 0
```

## task 4 - Деление элементов массивов
Реализуйте метод, принимающий в качестве аргументов два
целочисленных массива, и возвращающий новый массив, каждый 
элемент которого равен частному элементов двух входящих массивов 
в той же ячейке. Если длины массивов не равны, необходимо 
как-то оповестить пользователя. 

**Важно:** При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

Пример кода [**ArraysDivision.java**]() содержит метод **divideArrays**, 
который принимает в качестве аргументов два целочисленных массива 
и возвращает новый массив, каждый элемент которого равен частному
элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны или происходит деление на ноль, генерируется исключение
**RuntimeException**.

### Пример 1

```java
int[] array1 = {15, 90, 35, 185};
int[] array2 = {3, 10, 2, 5};

try {
    int[] result = DivideArrays.divideArrays(array1, array2);
    System.out.println("Результат деления массивов: " + Arrays.toString(result));
} catch (RuntimeException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```
### Результат 1

```
[5, 9, 17, 37]

Process finished with exit code 0
```
### Пример 2

```java
int[] array1 = {15, 90, 35, 185};
int[] array2 = {3, 10, 2, 0};

try {
    int[] result = DivideArrays.divideArrays(array1, array2);
    System.out.println("Результат деления массивов: " + Arrays.toString(result));
} catch (RuntimeException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```
### Результат 2

```
Ошибка: Невозможно выполнить деление на ноль

Process finished with exit code 0
```
### Пример 3

```java
int[] array1 = {15, 90, 35};
int[] array2 = {0, 0, 0, 0};

try {
    int[] result = DivideArrays.divideArrays(array1, array2);
    System.out.println("Результат деления массивов: " + Arrays.toString(result));
} catch (RuntimeException e) {
    System.out.println("Ошибка: " + e.getMessage());
}
```
### Результат 3

```
Ошибка: Деление не может быть выполнено, длины массивов не совпадают

Process finished with exit code 0
```



