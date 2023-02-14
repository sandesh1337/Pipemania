package hi.verkefni.vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

public class Pipemania {
    // public int numberOfPipes = 0;

    // private static final int ROWS = 8;
    // private static final int COLUMNS = 8;
    // private int[][] board = new int[ROWS][COLUMNS];

    // public Pipemania() {
    // // Initialize the board
    // for (int i = 0; i < ROWS; i++) {
    // for (int j = 0; j < COLUMNS; j++) {
    // board[i][j] = 0;
    // }
    // }
    // }

    // public int[][] getBoard() {
    // return board;
    // }

    // public void setBoardValue(int row, int column, int value) {
    // board[row][column] = value;
    // }

    // public String getNumberOfPipes() {
    // return numberOfPipes + "";
    // }

    // public void setNumberOfPipes(int numberOfPipes) {
    // this.numberOfPipes = numberOfPipes;
    // }

    private static final int F = 5;
    private final Pipa[][] pipulogn = new Pipa[F][F];
    private IntegerProperty stig = new SimpleIntegerProperty();

    private final ObjectProperty<Pipa> nuverandiPipa = new SimpleObjectProperty<Pipa>();

    private Pipukista myChest;

    public Pipemania(int fjoldipipa) {
        this.myChest = new Pipukista(fjoldipipa);
    }

    public IntegerProperty stigProperty() {
        return stig;
    }

    public Pipa[][] getPipulogn() {
        return pipulogn;
    }

    public int getStig() {
        return stig.get();
    }

    public void setStig(int stig) {
        this.stig.set(stig);
    }

    public ObservableList<Pipa> getMyChest() {
        return myChest.getKista();
    }

    public Pipukista getP() {
        return myChest;
    }

    public void setMyChest(Pipukista myChest) {
        this.myChest = myChest;
    }

    public Pipa getNuverandiPipa() {
        return nuverandiPipa.get();
    }

    public ObjectProperty<Pipa> nuverandiPipaProperty() {
        return nuverandiPipa;
    }

    public void setNuverandiPipa(Pipa nuverandiPipa) {
        this.nuverandiPipa.set(nuverandiPipa);
    }

    public void setNaestaPipa(int i, int j) {
        Pipa temp = myChest.naestaPipa();
        this.pipulogn[i][j] = temp;
        setNuverandiPipa(temp);
    }

    public void flaedir() {
        // uppfÃ¦ra stig aaaaaa
        // .flaedir();
    }

    public Pipukista getKista() {
        return myChest;
    }
}