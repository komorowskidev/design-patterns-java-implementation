package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton

import pl.komorowskidev.designpatternsjavaimplementation.creational.singleton.BestSingleton
import spock.lang.Specification

import java.util.concurrent.ConcurrentLinkedQueue

class SingletonTest extends Specification{

    def "every instance should be the same object and shouldn't be null"(){
        given:
        int numberOfThreads = 20
        Queue<BestSingleton> bestSingletonQueue = new ConcurrentLinkedQueue<>()
        List<Thread> threads = new ArrayList<>()
        for(int i = 0; i < numberOfThreads; i++){
            threads.add(new Thread({bestSingletonQueue.add(BestSingleton.getInstance())}))
        }

        when:
        threads.each {it.start()}
        Thread.sleep(100)

        then:
        bestSingletonQueue.size() == numberOfThreads
        Set<BestSingleton> bestSingletonSet = new HashSet<>(bestSingletonQueue)
        bestSingletonSet.size() == 1
        bestSingletonSet[0] != null
    }
}
