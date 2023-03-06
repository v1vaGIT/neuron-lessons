 
package org.ael.nn.platform.layer;


import java.util.List;
import org.ael.nn.platform.connection.Synapse;
import org.ael.nn.platform.vector.Vector;
import org.testng.annotations.Test;


/**
 *
 * @author vaganovdv
 */
public class LayerTest {
    
    /**
     * Тест создания слоя нейронов
     */
    @Test(priority = 1, groups = {"platform-core"})
    public void createLayer() {

        // Создается слой нейронов, который 
        // с номером 0, содержащий 1 нейрон        
        Layer layer = new Layer(0, 3);

        // Создается вектор с разменостью 3 элемента
        Vector v1 = new Vector(4);

        // Добавление вектора 
        List<Synapse> neuronInput = layer.addInputVector(v1);

        // печать слоя на терминале
        System.out.println(layer);

    }

    @Test(priority = 1, groups = {"platform-core"})
    public void createMiniNetwork() {
        // Создается входной слой нейронов
        // с номером 0, содержащий 3 нейрона       
        Layer inputLayer = new Layer(0, 3);

        // Создается промежуточный слой нейронов
        // с номером 1, содержащий 1 нейрон       
        Layer innerLayer = new Layer(1, 1);

        //Соединяем два слоя синапсами
        List<Synapse> synapseList = inputLayer.connectToLayer(innerLayer);

        //Выводим информацию
        System.out.println(inputLayer.toString() + "\n" + "соединен с " + innerLayer.toString() + "\n" + "с помощью синапсов:");
        for (int i = 0; i < synapseList.size(); i++) {
            System.out.println("№" + (i+1) + " " + synapseList.get(i).toString());
        }
    }
        
    
}
