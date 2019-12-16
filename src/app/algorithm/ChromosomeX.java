package app.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ChromosomeX {
    private List<Object> chromosome = new ArrayList<Object>();
    private int chromosomePoint = 0;

    public void setChromosome(int i, Object random) {
        chromosome.add(i, random);
    }

    public List<Object> getChromoSome() {
        return chromosome;
    }

    public void setChromosomePoint(int point) {
        chromosomePoint = point;
    }

    public int getChromosomePoint() {
        return chromosomePoint;
    }

    public void fixChromosome(int i, Object random) {
        chromosome.set(i, random);
    }

    public Object getSpecificValue(int i) {
        return chromosome.get(i);
    }
}
