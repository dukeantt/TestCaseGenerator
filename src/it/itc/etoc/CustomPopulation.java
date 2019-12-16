package it.itc.etoc;

import java.util.LinkedList;
import java.util.List;

public class CustomPopulation extends Population {

//    private List<Chromosome> individuals;

    private CustomPopulation(List<Chromosome> list) {
        super(list);
    }


    public static CustomPopulation generateRandomPopulation() {
        List<Chromosome> individs = new LinkedList<>();
        for (int j = 0; j < Population.populationSize; j++) {
            chromosomeFormer.buildNewChromosome();
            individs.add(chromosomeFormer.getChromosome());
        }
        return new CustomPopulation(individs);
    }

    public List getChromoList() {
        return individuals;
    }

}
