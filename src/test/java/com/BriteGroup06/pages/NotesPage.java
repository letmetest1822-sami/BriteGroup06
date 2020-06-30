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

@FindBy(xpath = "//a[contains(text(),'Notes')]")
public WebElement notesLink;

@FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
public WebElement importBtn;

@FindBy(xpath = "//input[@placeholder='No file chosen...']")
public WebElement fileToImport;

}
