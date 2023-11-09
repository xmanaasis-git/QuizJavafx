package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;



public class QuizController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }


    private void loadQuestions() {


        if (counter == 0) { //Question 1
            question.setText("1. In which year did Nepal officially become a federal democratic republic?");
            opt1.setText("2006");
            opt2.setText("2008");
            opt3.setText("2015");
            opt4.setText("2017");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Which king is considered the founder of modern Nepal?");
            opt1.setText("King Prithvi Narayan Shah");
            opt2.setText("King Birendra Bir Bikram Shah");
            opt3.setText("King Mahendra Bir Bikram Shah");
            opt4.setText("King Gyanendra Bir Bikram Shah");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Who built changunarayan?");
            opt1.setText("Anshu Barma");
            opt2.setText("Mandav");
            opt3.setText("Narendra Dev");
            opt4.setText("Suk Dev");
        }
        if (counter == 3) { //Question 4
            question.setText("4.Which festival is known as the Festival of Lights in Nepal?");
            opt1.setText(" Dashain");
            opt2.setText("Tihar");
            opt3.setText("Holi");
            opt4.setText("Teej");
        }
        if (counter == 4) {//Question 5
            question.setText("5. How long did Licchavi Dynasty ruled in Nepal");
            opt1.setText("900 Years");
            opt2.setText("600 Years");
            opt3.setText("700 Years");
            opt4.setText("800 Years");
        }
        if (counter == 5) { //Question 6
            question.setText("6. When was Rani Pokhari built?");
            opt1.setText("1747 B.S");
            opt2.setText("1717 B.S");
            opt3.setText("1727 B.S");
            opt4.setText("1737 B.S");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Which city is known as the \"City of Temples\" in Nepal?");
            opt1.setText("Kathmandu");
            opt2.setText("Pokhara");
            opt3.setText("Bhaktapur");
            opt4.setText("Patan");
        }
        if (counter == 7) { //Question 8
            question.setText("8.  Who composed the national anthem of Nepal?");
            opt1.setText(" Ambar Gurung");
            opt2.setText("Chakrapani Chalise");
            opt3.setText(" Byakul Maila");
            opt4.setText("Arun Thapa");
        }
        if (counter == 8) { //Question 9
            question.setText("9. Which dynasty ruled Nepal from 1768 to 2008?");
            opt1.setText("Rana dynasty");
            opt2.setText("Thakuri dynasty");
            opt3.setText("Shah dynasty");
            opt4.setText("Malla dynasty");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Which UNESCO World Heritage site is located in Lumbini?");
            opt1.setText(" Pashupatinath Temple");
            opt2.setText("Birthplace of Lord Buddha");
            opt3.setText("Boudhanath Stupa");
            opt4.setText(") Swayambhunath Stupa");
        }
        if (counter == 10) { //Question 11
            question.setText("11. Which famous trekking route in Nepal is known as the Annapurna Circuit?");
            opt1.setText("  Everest Base Camp Trek");
            opt2.setText("Langtang Valley Trek");
            opt3.setText(" Annapurna Base Camp Trek");
            opt4.setText(" Manaslu Circuit Trek");
        }
        if (counter == 11) { //Question 12
            question.setText("12. Which city is famous for its Durbar Square and pagoda-style temples in Nepal?");
            opt1.setText("Bhaktapur");
            opt2.setText("Patan");
            opt3.setText("Pokhara");
            opt4.setText("Kathmandu");
        }
        if (counter == 12) { //Question 13
            question.setText("13. Which river is considered the holiest in Nepal?");
            opt1.setText(" Koshi River");
            opt2.setText(" Bagmati River");
            opt3.setText("Karnali River");
            opt4.setText("Gandaki River");
        }
        if (counter == 13) { //Question 14
            question.setText("14. Which festival is celebrated to honor the sacred bond between brothers and sisters in Nepal?. ");
            opt1.setText(" Teej");
            opt2.setText(" Tihar");
            opt3.setText(" Holi");
            opt4.setText(" Raksha Bandhan");
        }
        if (counter == 14) { //Question 15
            question.setText("15. Which king of Nepal is known as the People's King?");
            opt1.setText(" King Prithvi Narayan Shah");
            opt2.setText(" King Birendra Bir Bikram Shah");
            opt3.setText("King Mahendra Bir Bikram Shah");
            opt4.setText("King Gyanendra Bir Bikram Shah");
        }
        if (counter == 15) { //Question 16
            question.setText("16. Which famous Nepalese warrior is known for his bravery and service in the British Army?");
            opt1.setText("  Sher Bahadur Deuba");
            opt2.setText(" Pushpa Kamal Dahal");
            opt3.setText("Birendra Bir Bikram Shah");
            opt4.setText("Gurkha soldiers");
        }
        if (counter == 16) { //Question 17
            question.setText("17. Which ancient trade route passed through Nepal, connecting India and Tibet?");
            opt1.setText("  Silk Road");
            opt2.setText(" Spice Route");
            opt3.setText(" Tea Horse Road");
            opt4.setText("Incense Route");
        }
        if (counter == 17) { //Question 18
            question.setText("18.  Which religion is the majority in Nepal?");
            opt1.setText("  Hinduism");
            opt2.setText("  Buddhism");
            opt3.setText("Islam");
            opt4.setText("Christianity");
        }
        if (counter == 18) { //Question 19
            question.setText("19. Which famous Nepalese festival is celebrated to mark the end of the monsoon season?");
            opt1.setText(" Holi");
            opt2.setText("Dashain");
            opt3.setText("Tihar");
            opt4.setText("Teej");
        }
        if (counter == 19) { //Question 20
            question.setText("20. Which famous Nepalese festival is celebrated to mark the victory of good over evil?");
            opt1.setText(" Bisket Jatra");
            opt2.setText(" Tihar");
            opt3.setText(" Holi");
            opt4.setText(" Dashain");
        }
    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;


        }
        if (counter == 19) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {


        if (counter == 0) {
            if (answer.equals("2008")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("King Prithvi Narayan Shah")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Mandav")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Tihar")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("800 Years")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("1727 B.S")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Kathmandu")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Ambar Gurung")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Shah dynasty")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Birthplace of Lord Buddha")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 10) {
            if (answer.equals("Annapurna Base Camp Trek")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 11) {
            if (answer.equals("Bhaktapur")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 12) {
            if (answer.equals("Bagmati River")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 13) {
            if (answer.equals("Raksha Bandhan")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 14) {
            if (answer.equals("King Birendra Bir Bikram Shah")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 15) {
            if (answer.equals("Gurkha soldiers")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 16) {
            if (answer.equals("Tea Horse Road")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 17) {
            if (answer.equals(" Hinduism")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 18) {
            if (answer.equals("Teej")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 19) {
            if (answer.equals("Dashain")) {
                return true;
            } else {
                return false;
            }
        }

        return false;


    }


    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }

        if (counter == 19) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }

        if (counter == 19) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }

        if (counter == 19) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    public void nextClicked(ActionEvent actionEvent) {
        if (counter < 19) {
            counter++;
            loadQuestions();
        }
    }

    public void previousClicked(ActionEvent actionEvent) {
        if (counter > 0) {
            counter--;
            loadQuestions();
        }
    }

}