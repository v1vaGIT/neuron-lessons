/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.ael.nn.platform.data.loader;

import org.testng.annotations.Test;

/**
 *
 * @author viva
 */
public class DataLoaderTest {

    String path = "D:/JetBrains/projects/ner05/neuronet-core/core/data-loader/src/test/java/test/data";
    String fileName = "digits.dat";

    @Test(priority = 1, groups = { "platform-core" })
    public void loadImageFromFileNoPath() {

        DataLoader loader = new DataLoader();
        loader.load(path, fileName);

    }

}
