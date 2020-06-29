package com.BriteGroup06.step_definitions;

import com.BriteGroup06.pages.EventsPage;
import com.BriteGroup06.pages.InsideEventPage;
import com.BriteGroup06.utilities.BrowserUtils;
import com.BriteGroup06.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;


public class EventsStepDefs {

    InsideEventPage insideEventPage = new InsideEventPage();
    Random random = new Random();
    private static Date actualDate, expectedDate;

    @When("the user click on any event from the table {int}")
    public void the_user_click_on_any_event_from_the_table(Integer turn) throws ParseException {

        int eventNumber = randomEvent();
        String path = "//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']/div["+ eventNumber +"]" ;
        WebElement event = Driver.get().findElement(By.xpath(path));
        BrowserUtils.scrollToElement(event);
        BrowserUtils.waitForClickablility(event,10);
        expectedDate = getExpectedDate(eventNumber);
        event.click();
        System.out.println("You clicked on an event in the event page");

    }

    @Then("the information should match with the table")
    public void the_information_should_match_with_the_table() throws ParseException {

        actualDate = getActualDate();
        System.out.println("actualDate.toString() = " + actualDate.toString());
        System.out.println("expectedDate.toString() = " + expectedDate.toString());
        Assert.assertEquals("Verify that the event begin date/time is matching with the table",
                            0, expectedDate.compareTo(actualDate));

        System.out.println("You verified that the event begin date/time is matching with the table");
    }

    public int randomEvent() {
        EventsPage eventsPage = new EventsPage();
        int eventNumber = random.nextInt(Integer.parseInt(eventsPage.pageLimit.getText()))+1;
        System.out.println(eventNumber);
        return eventNumber;
    }

    private Date getExpectedDate(int eventNumber) throws ParseException {

        String date, year, month, monthName, day, timeAmPm, time;

        String path = "//div[@class='o_kanban_view o_event_kanban_view o_kanban_ungrouped']/div["
                       + eventNumber + "]/div[2]/div";

        List<WebElement> dateInfo = Driver.get().findElements(By.xpath(path));
        BrowserUtils.waitForVisibility(dateInfo.get(1),10);
        BrowserUtils.waitFor(2);

        year = dateInfo.get(1).getText().split(" ")[1];
        monthName = dateInfo.get(1).getText().split(" ")[0];
        month = Integer.toString(getMonthNumber(monthName)+1);
        day = dateInfo.get(0).getText();
        timeAmPm = dateInfo.get(2).getText();
        time = AmPmtoDigit(timeAmPm);

        date = year + "-" + month + "-" + day + " " + time;
        expectedDate = StringToDate(date);

        return expectedDate;

    }

    private Date getActualDate() throws ParseException {

        BrowserUtils.waitForVisibility(insideEventPage.beginDate,10);
        String beginTime = insideEventPage.beginDate.getText();

        String date = formatTime(beginTime);
        actualDate = StringToDate(date);

        return actualDate;
    }

    public Date StringToDate(String s){

        Date result = null;

        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            result  = dateFormat.parse(s);
        }
        catch(ParseException e){
            e.printStackTrace();
        }

        return result ;

    }

    public int getMonthNumber(String monthName) throws ParseException {

        Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(monthName);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.MONTH);

    }

    public String AmPmtoDigit(String time) throws ParseException {

        SimpleDateFormat AmPmFormat = new SimpleDateFormat("hh:mm a");
        SimpleDateFormat digitFormat = new SimpleDateFormat("HH:mm:ss");
        Date oldTime = AmPmFormat.parse(time);

        return digitFormat.format(oldTime);

    }

    public String formatTime(String date) throws ParseException {

        SimpleDateFormat oldFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date oldTime = oldFormat.parse(date);

        return newFormat.format(oldTime);

    }

}