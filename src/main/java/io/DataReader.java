package io;

import entity.Product;
import exceptions.TxtException;
import util.ProductTxtUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    private String fileName;

    public DataReader(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public List<Product> readFromFile() throws IOException {

        List<Product> productBase = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.readLine();
            String txtString;
            while ((txtString = reader.readLine()) != null) {
                Product product = ProductTxtUtils.toObject(txtString);
                productBase.add(product);
            }
        } catch (TxtException e) {
            e.printStackTrace();
        }
        return productBase;
    }
}
