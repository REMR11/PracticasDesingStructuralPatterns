package prototype;

import prototype.model.implement.FeaturePhone;
import prototype.model.implement.Smartphone;

public class PrototypeMain {
    public static void main(String[] args) {
        // Crear prototipos de teléfono
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", "iOS", 128);
        FeaturePhone featurePhone = new FeaturePhone("Nokia", "3310", 1200);

        // Clonar los teléfonos
        Smartphone clonSmartphone = (Smartphone) smartphone.clonar();
        FeaturePhone clonFeaturePhone = (FeaturePhone) featurePhone.clonar();

        // Personalizar los clones
        clonSmartphone.setModelo("iPhone 14 Pro");
        clonSmartphone.setAlmacenamiento(256);


        clonFeaturePhone.setModelo("Nokia 3330");

        // Mostrar los resultados
        System.out.println("Teléfono original: " + smartphone);
        System.out.println("Teléfono clonado: " + clonSmartphone);

        System.out.println("Teléfono original: " + featurePhone);
        System.out.println("Teléfono clonado: " + clonFeaturePhone);
    }
}
