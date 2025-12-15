package es.cursojava.mongoDB;

import com.mongodb.client.*;
import org.bson.Document;

public class Main {
	public static void main(String[] args) {

		// *** Pega aquí tu URI de Atlas ***
		String uri = "mongodb+srv://DaniMongodb:jYnJrpE0Zex4TVKc@cluster0.tmnrdrf.mongodb.net/?appName=Cluster0";

		// Crear cliente
		try (MongoClient mongoClient = MongoClients.create(uri)) {

			// Acceder a una base de datos
			MongoDatabase database = mongoClient.getDatabase("getafemongodb");

			// Acceder a una colección
			MongoCollection<Document> collection = database.getCollection("usuario");

			// Leer un documento
			Document doc = collection.find().first();
			System.out.println("Primer documento: " + doc);
			
			
			// insertar
				Document newUser = new Document("nombre", "Juan")
					.append("edad", 30)
					.append("email", "ulima");
				collection.insertOne(newUser);
				System.out.println("Documento insertado: " + newUser.toJson());
				
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
