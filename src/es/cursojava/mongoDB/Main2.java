package es.cursojava.mongoDB;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;

import org.bson.Document;

public class Main2 {
	public static void main(String[] args) {

		// *** Pega aquí tu URI de Atlas ***
		String uri = "mongodb+srv://DaniMongodb:jYnJrpE0Zex4TVKc@cluster0.tmnrdrf.mongodb.net/?appName=Cluster0";

		// Crear cliente
		try (MongoClient mongoClient = MongoClients.create(uri)) {

			// Acceder a una base de datos
			MongoDatabase database = mongoClient.getDatabase("getafemongodb");

			// Acceder a una colección
			MongoCollection<Document> collection = database.getCollection("usuario");

			// consultas

			// Leer un documento
			Document doc = collection.find().first();
			System.out.println("Primer documento: " + doc);

			//  Mostrar TODOS los documentos de la colección
            System.out.println("\n--- Todos los documentos ---");
            for (Document d : collection.find()) {
                System.out.println(d.toJson());
            }

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
