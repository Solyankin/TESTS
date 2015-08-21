/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.butik.фильтрация;

import com.uisteps.thucydides.run.UserStory;
import com.uisteps.thucydides.run.UserTest;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

/**
 *
 * @author A.Solyankin
 */
public class фильтрация extends UserStory {

    @When("Пользователь применяет любой фильтр <serv>")
    public void пользователь_применяет_любой_фильтр(String serv) {
        user.openUrl("http://" + serv);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Пользователь применяет любой фильтр первый тест");
    }

    @Then("Сайт отображает строку 'Ваш выбор'")
    public void сайт_отображает_строку_Ваш_выбор() {
        System.out.println("(\"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Сайт отображает строку 'Ваш выбор'");
    }

    @Then("Сайт выводит в строке 'Ваш выбор' наименование каждого примененного фильтра")
    public void сайт_выводит_в_строке_ваш_выбор_наименование_каждого_примененного_фильтра() {
        System.out.println("(\"(\\\"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Сайт выводит в строке 'Ваш выбор' наименование каждого примененного фильтра");
    }

    @Then("Каждый следующий выбранный фильтр добавляется в конец")
    public void каждый_следующий_выбранный_фильтр_добавляется_в_конец() {
        System.out.println("(\"(\\\"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Каждый следующий выбранный фильтр добавляется в конец");
    }

    @Then("Сайт отфильтровывает товар в соответствии с выбранном фильтром")
    public void сайт_отфильтровывает_товар_в_соответствии_с_выбранном_фильтром() {
        System.out.println("(\"(\\\"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& Сайт отфильтровывает товар в соответствии с выбранном фильтром");
    }
}
