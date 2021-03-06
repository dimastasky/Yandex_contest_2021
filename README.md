# Yandex_contest_2021
## Summer + Autumn

## Осенняя стажировка 2021
## A. Медиана с вычитанием

Дан массив a длины 3 из целых чисел.

Определим операцию изменения массива: выбирается два различных индекса i и j (1≤i,j≤3, i≠j), после чего a[i] становится равным a[i]−a[j].

Пример операции: дан массив [1,−3,2], выбрали i=2,j=1, получили массив [1,−3−1,2] = [1,−4,2].

Определим для массива a медиану m как значение, расположенное на позиции 2 при сортировке элементов массива a.

К примеру, медианой массива a = [1,−3,2] является m = 1, так как в сортированном массиве [−3,1,2] именно 1 стоит на позиции 2.

Назовём медианным индексом такой индекс i, что ai = m.

Обратите внимание, что медианный индекс необязательно единственный: в массиве a = [3,0,3] медиана m = 3, а медианными индексами являются i1 = 1 (a1 = m) и i2 = 3 (a3 = m).

Для каждого индекса i массива a выясните, может ли он стать медианным, если можно сделать не более одной операции изменения массива (можно не делать операций вовсе). 

### Формат ввода
В единственной строке даны 3 целых числа ai (−109≤ai≤109), разделенные пробелами.
### Формат вывода
Для каждого индекса i (1≤i≤3) выведите в отдельной строке ответ: YES, если после не более, чем одной операции изменения массива i может стать медианным индексом; NO — иначе. 

### Пример 1
| Ввод | Вывод |
|--------|------|
| 2       | YES |
| 6       | YES |
| 5  | YES |


### Пример 2
| Ввод | Вывод |
|-----|------|
| 0 | YES |
| -3 | NO |
| 1 | YES |

###Примечания
В первом тесте a = [2,6,5].

Если сделать операцию изменения i=2,j=3, то получится массив [2,1,5], медиана будет равна 2, а значит i = 1 будет являться медианным индексом.

Если сделать операцию изменения i=2,j=1, то получится массив [2,4,5], медиана будет равна 4, а значит i = 2 будет являться медианным индексом.

Если не делать никаких операций изменения, то медианой массива [2,6,5] будет 5, а значит i = 3 будет являться медианным индексом. Аналогично i=3 будет медианным индексом после операции изменения i=3,j=1.

Во втором тесте единственной операцией изменения, делающей индекс i=2 медианным, является операция i=2,j=2, но такая операция не является корректной, так как индексы i и j должны быть различны. 

## B. Яндекс.Бар
Яндекс запускает новый бизнес-юнит – Яндекс.Бар. При разработке меню появилась необходимость рисовать слоистые коктейли. Для поддержания концепции IT-бара было принято решение рисовать коктейли, используя ASCII-арт. Вам необходимо считать форму стакана и список ингредиентов слоистого коктейля, заполнить стакан ингредиентами в нужном порядке и распечатать результат.

Описание стакана – это символьное поле из n строк по m символов в каждой. Поле состоит из символов . (точек), \ (обратных слешей), / (прямых слешей), | (вертикальных черт), _ (нижних подчеркиваний) и пробелов.

Дно стакана расположено на последней n-й строке и состоит из символов _ (нижних подчеркиваний), расположенных слитно.

Слева и справа от дна нарисованы грани стакана. Грань – это «ломаная» из символов \ (обратных слешей), / (прямых слешей), | (вертикальных черт). Каждая грань состоит из ровно n символов, начинается в последней n-й строке и заканчивается в первой. Для любой пары соседних строк i и i+1 символы грани расположены в одном или соседних столбцах. Грани не пересекаются и не касаются друг друга ни по стороне, ни по углу. В частности из этого следует, что в любой строке, кроме последней n-й, есть пустое место, обозначаемое пробелами.

Фон изображения стакана состоит из символов . (точек), расположенных слева от левой грани стакана и справа от правой. 

### Формат ввода
Первая строка содержит два числа n и m (2≤n≤100, 3≤m≤100), которые обозначают размеры поля – изображения стакана.

Следующие n строк по m символов в каждой содержат описание стакана в формате, указанном выше.

Следующая строка содержит число k (0≤k≤min(n−1,89)) – количество ингредиентов коктейля.

Следующие k строк содержат описания ингредиентов, по одному в каждой строке. Описание имеет вид nameicountisymboli.

namei – это название i-го ингредиента (строка из строчных латинских букв длиной не менее 1 и не более 10).

counti – это количество слоев i-го ингредиента.

symboli – это символ, которым i-й ингредиент должен быть представлен в изображении (любой символ с ASCII кодом больше 32 и меньше 127, кроме тех, которые используются в описании изображения стакана).

Гарантируется, что сумма всех counti не превосходит высоты стакана, то есть n−1. Также гарантируется что все символы symboli уникальны. 

### Формат вывода

В n строках по m символов в каждой выведите описание стакана в указанном выше формате. 




