Scenario: Применение фильтра_1

Meta:
@issues #BW-10 
@serv google.com

When Пользователь применяет любой фильтр <serv>
Then Сайт отображает строку 'Ваш выбор'
Then Сайт выводит в строке 'Ваш выбор' наименование каждого примененного фильтра
Then Каждый следующий выбранный фильтр добавляется в конец
Then Сайт отфильтровывает товар в соответствии с выбранном фильтром

Scenario: Применение фильтра_1_1

Meta:
@issues #BW-10

When Пользователь применяет любой фильтр <serv>
Then Сайт отображает строку 'Ваш выбор'
Then Сайт выводит в строке 'Ваш выбор' наименование каждого примененного фильтра
Then Каждый следующий выбранный фильтр добавляется в конец
Then Сайт отфильтровывает товар в соответствии с выбранном фильтром

Examples:
serv        |
afisha.ru   |
lenta.ru    |

