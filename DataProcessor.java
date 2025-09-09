import java.io.*;

class DataReader {
    public void readData() throws IOException {
        throw new IOException("Data not found");
    }
}

public class DataProcessor {
    public void processDataHandle() {
        try {
            new DataReader().readData();
        } catch (IOException e) {
            System.out.println("Handled inside DataProcessor: " + e.getMessage());
        }
    }

    public void processDataPropagate() throws IOException {
        new DataReader().readData(); // propagate
    }
}