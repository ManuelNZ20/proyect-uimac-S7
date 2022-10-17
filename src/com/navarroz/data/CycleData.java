package com.navarroz.data;

import com.navarroze.uml.Cycle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

public final class CycleData {

    private static final String route = "files/cycledata.txt";
    Vector<Cycle> vCycle;

    public CycleData() {
        vCycle = new Vector<>();
    }

    public Vector<Cycle> getVector() {
        initData();
        return vCycle;
    }

    private void initData() {
        File file = new File(route);
        if (file.exists()) {
            vCycle.add(new Cycle("Seleccionar", 0));
            try ( BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = "";
                while ((line = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(line, "/");
                    vCycle.add(new Cycle(st.nextToken().trim(), Float.valueOf(st.nextToken().trim())));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, cycledata, " + e, "Control cycle", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El fichero no existe");
        }
    }
}
