# Weighted Graph DFS Java

Implementasi Graf Berbobot dengan algoritma **Depth-First Search (DFS)** di Java.

## 📖 Deskripsi Proyek

**Weighted_Graph_DFS_Java** adalah proyek Java yang mengimplementasikan graf berbobot menggunakan **matriks adjacensi** dan traversal **DFS dengan stack**. Proyek ini mencakup:

- **Vertex.java**: Kelas dasar untuk vertex dengan label karakter dan flag kunjungan.
- **Graph.java**: Kelas utama untuk mengelola graf, dengan metode:
  - `addVertex()` – Menambahkan vertex baru.
  - `addEdge()` – Menambahkan edge berbobot antar vertex.
  - `print()` – Menampilkan matriks adjacensi.
  - `dfs()` – Menjalankan Depth-First Search.
- **GraphMain.java**: Kelas utama untuk menguji graf dengan dua contoh:
  - Graf pertama: 9 vertex (A-I)
  - Graf kedua: 5 vertex (A-E)

## 🧠 Teknologi
- Java (JDK 8 atau lebih baru)

## 📂 Struktur File
```
Weighted_Graph_DFS_Java/
├── src/PERTEMUAN9/
├── GraphMain.java     # Kelas utama untuk pengujian
├── Graph.java         # Kelas graf dengan DFS
├── Vertex.java        # Kelas vertex
```

## 🟢 Catatan
- Maksimum 10 vertex.
- Matriks adjacensi diisi `-1` untuk edge yang tidak ada.
- DFS dimulai dari vertex pertama (indeks 0).
- Menggunakan **stack** (tanpa rekursi).

## 📈 Contoh Output
```
Daftar Vertex: 
A B C D E F G H I 

DFS: 
A B C D G E F H I 

Graph:
        A       B       C       D       E       F       G       H       I
A       0       1       -1      -1      -1      1       -1      -1      1
B       1       0       1       -1      1       -1      -1      -1      -1
C       -1      1       0       1       1       -1      -1      -1      -1
D       -1      -1      1       0       -1      -1      1       1       -1
E       -1      1       1       -1      0       -1      1       -1      -1
F       1       -1      -1      -1      -1      0       1       -1      -1
G       -1      -1      -1      1       1       1       0       -1      -1
H       -1      -1      -1      1       -1      -1      -1      0       -1
I       1       -1      -1      -1      -1      -1      -1      -1      0
```

## 👨‍💻 Pengembang
- **MBAHSINGO22** – [GitHub](https://github.com/MBAHSINGO22)
