package com.BriteGroup06.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesPage extends BasePage{

@FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
public WebElement createBtn;

@FindBy(xpath = "//div[@class='note-editable panel-body']")
public  WebElement notesPnl;

@FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
public WebElement saveBtn;

@FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_edit']")
public WebElement editBtn;
}
