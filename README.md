<h1 align="center">Linguagem de Programação   <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" height="40" alt="java logo">



<h3> Tabela de Notas:</h3>

<img src="TesteMesa.png" width="60%" />

---
<h3> Musica: Don's Cry - Guns N' Roses </h3>
<a href="https://www.youtube.com/watch?v=zRIbf6JqkNc" target="_blank">
  <img src="https://img.youtube.com/vi/zRIbf6JqkNc/0.jpg" alt="Assista ao vídeo" width="300">
</a>
<h3> Diagrama UML da Musica: </h3>

```mermaid
classDiagram
class Banda{
  +id: Int
  +nome: String
  +nacionalidade: String
  +nomeBanda(): void

}
class Musica{
  +id: Int
  +nomeMusica: String
  +duracao: Float
  +musicaAtual(): void
}
class Album{
  +id: Int
  +nome: String
  +ano: Date
  +InformarAlbum(): void
}
