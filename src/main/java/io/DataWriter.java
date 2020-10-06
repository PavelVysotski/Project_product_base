package io;

import entity.Product;
import util.ProductTxtUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter {

    private String fileName;

    public DataWriter(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void writeToFile(List<Product> productBsae) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(ProductTxtUtils.headers());

            for (Product product : productBsae) {
                writer.write(ProductTxtUtils.toTxtString(product));
            }
        }
    }
}
