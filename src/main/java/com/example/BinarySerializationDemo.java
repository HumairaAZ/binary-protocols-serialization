package com.example;

import java.io.*;

public class BinarySerializationDemo {
    public static void main(String[] args) {
        String fileName = "data/serializedData.bin";
        Data data = new Data(42, "Hello, World!");

        // Serialize data
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(data);
            System.out.println("Data has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize data
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Data deserializedData = (Data) in.readObject();
            System.out.println("Data has been deserialized");
            System.out.println(deserializedData);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Data implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String message;

    public Data(int id, String message) {
        this.id = id;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Data{id=" + id + ", message='" + message + "'}";
    }
}
