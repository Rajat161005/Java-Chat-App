# Java Chat Application 

This is a simple **client-server chat application** built using **Java Sockets** and **Multithreading**. It allows multiple clients to connect to a single server and chat with each other in real time.

#Features

- Real-time messaging between clients
- Multithreaded server that handles multiple users simultaneously
- Clean console-based chat interface
- Simple setup with only two Java files (`ChatServer.java` and `ChatClient.java`)

#Project Structure

Java-Chat-App
|__ ChatServer.java
|__ ChatClient.java
|__ README.md

#How It Works

- The ChatServer accepts client connections and starts a new thread for each client.
- Each client connects to the server using ChatClient and can send/receive messages in real time.
- The server broadcasts messages from one client to all others.

#Requirements

- Java (JDK 8 or above)
- A terminal or command prompt

#How to Run

#1. Compile the server and client
javac ChatServer.java
javac ChatClient.java

#OUTPUT

Output of the ChatServer.java
![Image](https://github.com/user-attachments/assets/732c961a-85dc-4ae4-8bcc-5ee961b73d67)

Output of the ChatClient.java
![Image](https://github.com/user-attachments/assets/e0a80f80-2056-4a5c-9fef-784458745e60)







