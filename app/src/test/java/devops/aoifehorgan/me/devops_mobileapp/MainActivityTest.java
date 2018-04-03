package devops.aoifehorgan.me.devops_mobileapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Aoife Horgan on 04/04/2018.
 */
public class MainActivityTest {
    MainActivity activity = new MainActivity();
    String add = activity.ADD;
    String minus = activity.SUB;
    String mul = activity.MUL;
    String div = activity.DIV;
    @Test
    public void applyOperation() throws Exception {
        double actual = activity.applyOperation(add,2,2);
        double expected = 4;
        assertEquals("Failed",expected,actual,0.001);

    }

    @Test
    public void onCreate() throws Exception {
    }

    @Test
    public void onCreateOptionsMenu() throws Exception {
    }

    @Test
    public void registerKey() throws Exception {
    }

    @Test
    public void display() throws Exception {
    }

    @Test
    public void endsWithNumber() throws Exception {
    }

    @Test
    public void endsWithOperator() throws Exception {
    }

    @Test
    public void findLastOperator() throws Exception {
    }

    @Test
    public void calculate() throws Exception {
    }

    @Test
    public void resetCalculator() throws Exception {
    }


}