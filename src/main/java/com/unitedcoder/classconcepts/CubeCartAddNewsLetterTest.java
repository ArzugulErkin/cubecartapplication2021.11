package com.unitedcoder.classconcepts;

public class CubeCartAddNewsLetterTest {
    public static void main(String[] args) throws InterruptedException {
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.openBrowser("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php?_g=customers&node=email#email_html");
        functionLibrary.logIn("testautomation1","automation123!");
        functionLibrary.verifyLogin();
        functionLibrary.addNewsLetter("About Climate","Richard","agt12@gmail.com","Global warming");
        functionLibrary.verifyNewsLetterAddedSuccessfully();
        functionLibrary.logout();
        functionLibrary.closeBrowser();

    }
}
