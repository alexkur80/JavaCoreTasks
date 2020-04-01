
package com.myproject.lection15;

import com.myproject.lection10.GenerateIntegerRandom2;
import com.myproject.utils.ApplicationLogger;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class WriteInt {

    public static void writeInt(String filePath) {

        Collection<Integer> setOne = new LinkedList<>();
        setOne = GenerateIntegerRandom2.randomInt(256, 500, 20, setOne);

        ApplicationLogger.LOGGER.info("List of generated int numbers:");
        Iterator<Integer> iteratorCollection = setOne.iterator();

        while (iteratorCollection.hasNext()) {
            Integer number = iteratorCollection.next();
            ApplicationLogger.LOGGER.info(number);

        }


        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            ApplicationLogger.LOGGER.error("Unable to create file " + file.getName());
        }
        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {

        //    DataOutputStream dos = new DataOutputStream(fos);


        }

    }


}

