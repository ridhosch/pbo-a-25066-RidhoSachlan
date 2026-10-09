# LAPORAN PRAKTIKUM PEMROGRAMAN BERBASIS OBJEK

| Informasi Praktikan | Keterangan |
| :--- | :--- |
| **Nama** | Ridho Sachlan |
| **NPM** | 4525210066 |
| **Kelas** | A |
| **Mata Kuliah** | Pemrograman Berbasis Objek (PBO) |
| **Pertemuan** | 04 - Inheritance (Pewarisan) |
| **Tanggal** | Kamis 24 September 2026 |

## 1. Implementasi Java

### 1.1. File: `Main.java`

**Penjelasan Kode:**
> Kelas utama untuk menguji instansiasi objek pegawai tetap dan pegawai kontrak serta memanggil method perhitungan gaji masing-masing.

**Bukti Eksekusi (Screenshot):**
- **Before** : ![before](img/java/MainJavabefore.png)
- **After**  : ![after](img/java/MainJavaafter.png)
### 1.2. File: `Pegawai.java`

**Penjelasan Kode:**
> Kelas induk yang mendefinisikan atribut umum seperti nama, NIP, dan gaji pokok bagi seluruh jenis pegawai.

**Bukti Eksekusi (Screenshot):**
- **Before** : ![before](img/java/PegawaiJavaBefore.png)
- **After**  : ![after](img/java/PegawaiJavaAfter.png)

### 1.3. File: `PegawaiKontrak.java`

**Penjelasan Kode:**
> Kelas turunan (subclass) yang mewarisi sifat induk dan mengimplementasikan perhitungan gaji spesifik melalui method overriding.

**Bukti Eksekusi (Screenshot):**
- **Before** : ![before](img/java/PegawaikontrakBefore.png)
- **After**  : ![after](img/java/PegawaiikontrakAfter.png)

### 1.4. File: `PegawaiTetap.java`

**Penjelasan Kode:**
> Kelas turunan (subclass) yang mewarisi sifat induk dan mengimplementasikan perhitungan gaji spesifik melalui method overriding.

**Bukti Eksekusi (Screenshot):**
- **Before**: ![before](img/java/PegawaitetapBefore.png)
- **After** : ![after](img/java/PegawaitetapAfter.png)

### Output

![Output Java](img/java/OutputJava.png)

---

## 2. Implementasi PHP

### 2.1. File: `main.php`

**Penjelasan Kode:**
> Program PHP yang mengeksekusi objek kepegawaian dan menampilkan rincian pendapatan akhir.

**Bukti Eksekusi (Screenshot):**
- **Before** : ![before](img/php/mainPHPbefore.png)
- **After**  : ![after](img/php/mainPHPafter.png)

### 2.2. File: `Pegawai.php`

**Penjelasan Kode:**
> Implementasi struktur hierarki kelas kepegawaian dalam PHP menggunakan mekanisme pewarisan kelas dan modifikasi perilaku method.

**Bukti Eksekusi (Screenshot):**
- **Before** : ![before](img/php/pegawaiPHPbefore.png)
- **After**  : ![after](img/php/pegawaiPHPafter.png)

### Output


![Output PHP](img/php/OuputPHP.png)

---

## 3. Kesimpulan

Pewarisan meningkatkan efisiensi penulisan kode melalui penggunaan ulang (code reuse), sementara method overriding memungkinkan fleksibilitas penentuan perilaku spesifik pada subclass.
