# Java: знакомство и как пользоваться базовым API (лекции)

## Лекции
* Lesson_1
* Lesson_2
* Lesson_3
* Lesson_4 Хранение и обработка данных ч1: приоритетные коллекции
* Lesson_5 Хранение и обработка данных ч2: множество коллекций Map

## Семинары

### Seminare_3
1. Даны сведения об экспортируемых товарах: указывается наименование
   товара, страна, экспортирующая товар, и объем поставляемой партии в штуках. Найти
   страны, ко
   торые экспортируют данный(введенный с кл-ы) товар, и общий объем его
   экспорта.

3. Дан массив объектов: фамилия студента, номер группы, размер стипендии, баллы по 3 предметам.
   Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.

3.	 Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах), его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
- количество кубиков желтого цвета и их суммарный объем;
- количество деревянных кубиков с ребром 3 см

4. Напишите метод, который на вход получает коллекцию объектов, а
   возвращает коллекцию уже без дубликатов.


## Дополнительные библиотеки Java

Установка:
File -> Project Structure -> Librories ->"+" 
---
```agsl
@Data
@AllArgsConstructor
@NoArgsConstructor
//В новый Класс для автоматического обьявления конструкторов
```


Project Lombok » 1.18.30
https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.30

---
SL4J » 1.0.13.5
https://mvnrepository.com/artifact/com.guicedee.services/sl4j/1.0.13.5

~~~
@Slf4j //выше Main

log.error("qwerty!") //try catch
~~~