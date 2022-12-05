package advanced.jakub;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private Button[] buttons;
  //  private int[] checked;
    private ArrayList<Integer> checked;
    private TextView question;
    private LinearLayout rlayout;
//   private String question;
  private int questionID;
   private ArrayList<Integer>  pastQuestions = new ArrayList<>(); // indexes of past questions so they don't repeat.(only if answered correctly maybe??)
                                              //make question N visible if clicking on reveal button which is yet to be implemented.
    //this is to fix question with problem if you notice one.
    private static Random random = new Random();
    private int qCount;
    private TextView q;

    private int rightA_count;
    private int totalRightA_count;
    private TextView rightA;
    private boolean getToPass;
    private int rightAnswers[];
private final static int QAMOUNT = 255;
    //private static HashMap<Integer, String> question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getToPass = true;
        qCount=0;
        rightA_count = 0;
        totalRightA_count = 0;
      //  pastQuestions = new ArrayList<>();
       init();
    }

    public void init() {
        buttons = new Button[6];
        checked = new ArrayList<>();
        questionID = -1;

       int randomQ = getRandomQ();
        questionID = randomQ;
 //    int randomQ = 99;
   //    questionID = randomQ;
        rightAnswers = new int[Constants.RIGHT_ANSWERS_N[questionID]];
         rightAnswers = Constants.RIGHT_ANSWERS[questionID];

       question = (TextView) findViewById(R.id.question); if(randomQ == -1) { System.out.println("end of questions"); return;}
        question.setText(Constants.QUESTIONS[randomQ]);
       //
        setQMisc();
        initButtons(randomQ);
               //set button color, on click listener and text
    }

    private void setQMisc() {
        q = (TextView) findViewById(R.id.q_count);
        rightA = (TextView) findViewById(R.id.rightA);
        q.setText("Questions: " + qCount + " / " + QAMOUNT);
        rightA.setText("Score : " + rightA_count + " / " + totalRightA_count);
    }


    private int getRandomQ()
    {
        // Generates random integers 0 to 49 = 50. \/ 10 = 0 to 9.
        int x = -1;
        if(pastQuestions.size() >= Constants.QUESTIONS.length) {
            System.out.println("returning -1");      return -1;
        }
     //   while(true) {
        while(pastQuestions.size() <= Constants.QUESTIONS.length ) {
            x = random.nextInt(QAMOUNT);
         System.out.println("testing : " + x);
     //    if(x == 6 ||  x == 9){ // ||
                if (!pastQuestions.contains(x)) {
                    pastQuestions.add(x); //System.out.println("returning random n : " + x);
                    qCount++;
                    return x;
         //       }
            }
        }
        return x;
    }


    @Override
    public void onClick(View view)
    {
          switch(view.getId()) {
              case R.id.btn1: System.out.println("button 1 pressed");
                  highLightAnswer(0);
                  break;
              case R.id.btn2: System.out.println("button 2 pressed");
                  highLightAnswer(1);
                  break;
              case R.id.btn3: System.out.println("button 3 pressed");
                  highLightAnswer(2);
                  break;
              case R.id.btn4: System.out.println("button 4 pressed");
                  highLightAnswer(3);
                  break;
              case R.id.btn5: System.out.println("button 5 pressed");
                  highLightAnswer(4);
                  break;
              case R.id.btn6: System.out.println("button 6 pressed");
                  highLightAnswer(5);
                  break;
              case R.id.main_layout: System.out.println("layout pressed, moving onto next question");
                  rlayout.setOnClickListener(null); init(); getToPass = true;
              break;
          }
    }

    private void highLightAnswer(int x)
    {
        if(checked.contains(x)) {
            buttons[x].setBackgroundResource(R.color.white);
            checked.remove((Object) x);
        } else {
            buttons[x].setBackgroundResource(R.color.purple_500);
            checked.add(x);
        }

        int toPass = Constants.RIGHT_ANSWERS_N[questionID]; // either 1 or 2
        if(checked.size() == 1 && getToPass) {
            totalRightA_count = totalRightA_count + toPass;
            getToPass = false;
        }
       // int rightAnswers[] = Constants.RIGHT_ANSWERS[questionID];


        if(toPass == 1 && checked.size() > 0) {
            System.out.println("1 right answer q");
            if (checked.get(0) == rightAnswers[0]) { // right answer
                buttons[x].setBackgroundResource(R.color.teal_700);
                rightA_count++;
            } else { // wrong answer
                //           buttons[rightAnswers[0]].setBackgroundResource(R.color.teal_700);
                buttons[x].setBackgroundColor(Color.RED);
                //highlight right answer
                buttons[rightAnswers[0]].setBackgroundColor(Color.GREEN);
            }
            //unbind buttons
            unbindButtons();
            rlayout = (LinearLayout) findViewById(R.id.main_layout);
            rlayout.setOnClickListener(this);
            //make layout clickable
            //reset things like checked arrayList
            //call init() if layout is clicked
            //end highLightAnswer method
            return;
        }
        System.out.println(checked.size() + " checked SIZE must be 3 I gyuess");
        if(toPass >= 2 && checked.size() == toPass) { // multiple choice answer
            for(int o = 0; o < checked.size(); o++)
            {
                for(int p = 0; p < rightAnswers.length; p++) {
               if(checked.get(o) != rightAnswers[p]) {
            //       System.out.println()
                   buttons[checked.get(o)].setBackgroundColor(Color.RED);
               }
               }
            }

            for(int i = 0; i < rightAnswers.length; i++) {
                  if(checked.contains(rightAnswers[i])) {
                      rightA_count++;
                      buttons[rightAnswers[i]].setBackgroundResource(R.color.teal_700);
            } else {
                      buttons[rightAnswers[i]].setBackgroundColor(Color.GREEN);
                  }
        }
            unbindButtons();
            rlayout = (LinearLayout) findViewById(R.id.main_layout);
            rlayout.setOnClickListener(this);
        }
    }


    private void unbindButtons()
    {
        for(int i = 0; i < buttons.length; i++) {
            buttons[i].setOnClickListener(null);
        }
    }


    private void initButtons(int randomQ)
    {
        int btnsSize = 0;
        int btns = Constants.Q_ANSWERS[randomQ].length;
        buttons[0] = (Button) findViewById(R.id.btn1) ; buttons[1] = (Button) findViewById(R.id.btn2) ; buttons[2] = (Button) findViewById(R.id.btn3); buttons[3] = (Button) findViewById(R.id.btn4); buttons[4] = (Button) findViewById(R.id.btn5); buttons[5] = (Button) findViewById(R.id.btn6);
try{
        for(int i =0; i< buttons.length; i++)
        {
            buttons[i].setOnClickListener(this);
            buttons[i].setVisibility(View.VISIBLE);
            buttons[i].setText(Constants.Q_ANSWERS[randomQ][i]);
            buttons[i].setBackgroundResource(R.color.white);
            buttons[i].setTextColor(Color.BLACK);
            buttons[i].setAllCaps(false);
            btnsSize++;
        }


        System.out.println(btns + " btns size hehehe");
        }catch (Exception e) {
            //  buttons[4].setText("..");
    System.out.println("invisible") ;
    if(btns == 4) {
        buttons[4].setVisibility(View.INVISIBLE);
        buttons[5].setVisibility(View.INVISIBLE);
    }
    if(btns == 5) {
        buttons[5].setVisibility(View.INVISIBLE);
    }

        }
System.out.println(btnsSize + " buttons size ");
        //randomize buttons
          ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> newRightAIndexes = new ArrayList<>();
          boolean pass = false; int i =0;
          while(!pass) {
              int x = random.nextInt(btnsSize);
              if(!indexes.contains(x)) {
                  buttons[i].setText(Constants.Q_ANSWERS[randomQ][x].substring(2));
                  for(int j = 0; j< rightAnswers.length; j++) {
                      if(rightAnswers[j] == x) {
                          System.out.println("newRightAIndexes ADDING X: " + x);
                          newRightAIndexes.add(i);
                      }
                  }
//                  for(int j = 0; j< rightAnswers.length; j++) {
//                      if(rightAnswers[j] == x) {
//                          if(!newRightAIndexes.contains(x)) {
//                              newRightAIndexes.add(x);
//                          }
//                      }
//                  }
                  indexes.add(x);
                  i++;
              }
              if(i == btnsSize) {
                  pass = true;
              }
          }
     for(int j = 0;j < newRightAIndexes.size(); j++) {
         rightAnswers[j] = newRightAIndexes.get(j);
     }
    }

}