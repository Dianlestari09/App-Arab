Aplikasi Pemrosesan Teks Arab
Ikhtisar
Repositori ini berisi aplikasi Java Swing yang dirancang untuk memproses teks Arab. Aplikasi ini menyediakan dua fungsi utama: menghapus tanda baca Arab (harakat) dan memisahkan teks Arab menjadi kata-kata individual (lafadz). Aplikasi ini mencakup antarmuka pengguna grafis (GUI) yang dibuat dengan Java Swing serta kelas uji untuk pemrosesan teks Arab sederhana.
File dalam Repositori
1. AppArabSatu.java

Tujuan: Kelas Java utama yang mengimplementasikan GUI dan fungsi inti dari aplikasi pemrosesan teks Arab.
Deskripsi: Kelas ini memperluas javax.swing.JFrame untuk membuat aplikasi berjendela dengan komponen berikut:
Kolom Input (tfInput): JTextField tempat pengguna memasukkan teks Arab.
Tombol Hapus Harakat (btHapusHarakat): Menghapus tanda baca Arab (misalnya, fatha, kasra, damma, sukun) dari teks input dan menampilkan hasilnya di JTextArea (taHapusHarakat).
Tombol Pemisah Lafadz (btPisahLafadz): Memisahkan teks input menjadi kata-kata individual, menampilkan setiap kata pada baris baru di JTextArea lain (taPisahLafadz).
Komponen UI: Termasuk label, panel, dan panel gulir untuk antarmuka yang ramah pengguna.


Metode Utama:
btHapusHarakatActionPerformed: Menyaring tanda baca Arab dari teks input.
btPisahLafadzActionPerformed: Memisahkan teks input berdasarkan spasi dan menampilkan setiap kata pada baris baru.


Masalah:
Metode btHapusHarakatActionPerformed memiliki kesalahan logika dalam perulangan, di mana text += c menambahkan ke string input asli, yang dapat menyebabkan keluaran salah. Juga kurang inisialisasi string keluaran yang tepat.
Tata letak GUI dapat ditingkatkan untuk penyelarasan dan responsivitas yang lebih baik.



2. percobaan.java

Tujuan: Kelas Java berbasis konsol sederhana untuk menguji penghapusan tanda baca Arab.
Deskripsi: Kelas ini memproses string Arab yang telah ditentukan (ArKalimat = "َلْكَلِمَةُ") dan mencetak karakter yang bukan tanda baca (fatha, kasra, damma, sukun) ke konsol, beserta indeksnya.
Fungsi Utama:
Mengiterasi string input dan menyaring tanda baca.
Berisi kondisi yang tidak digunakan untuk menangani spasi (if (c == ' ')), yang menambahkan baris baru tetapi tidak memengaruhi keluaran karena input tidak mengandung spasi.


Masalah:
Logika penambahan baris baru (ArKalimat += '\n') tidak efektif karena string yang dimodifikasi tidak digunakan.
Terbatas pada keluaran konsol dan input yang telah ditentukan, sehingga kurang fleksibel.



3. AppArabSatu.form

Tujuan: File XML yang dihasilkan oleh NetBeans yang mendefinisikan tata letak GUI untuk AppArabSatu.java.
Deskripsi: File ini menentukan properti dan tata letak komponen Swing (misalnya, tombol, kolom teks, area teks, label) yang digunakan dalam GUI AppArabSatu. File ini digunakan oleh NetBeans Form Editor untuk merancang antarmuka secara visual.
Catatan: File ini tidak dimaksudkan untuk diedit secara manual, karena sangat terkait dengan NetBeans IDE. File ini disertakan untuk kompatibilitas dengan pembuat GUI NetBeans.

Fitur

Hapus Harakat: Menghapus tanda baca Arab dari teks input, mempertahankan huruf dasar.
Pisah Lafadz: Memisahkan teks Arab menjadi kata-kata individual, ditampilkan per baris.
GUI Ramah Pengguna: Dibuat dengan Java Swing, dilengkapi kolom input, tombol, dan area keluaran untuk interaksi yang mudah.
Lintas Platform: Berjalan di sistem apa pun yang memiliki Java Runtime Environment (JRE) terinstal.

Prasyarat

Java Development Kit (JDK): Versi 8 atau lebih tinggi.
IDE (Opsional): NetBeans direkomendasikan untuk pengeditan GUI yang mudah karena adanya file .form, tetapi IDE Java lain (misalnya, IntelliJ, Eclipse) dapat mengompilasi dan menjalankan kode.
Dependensi: Pustaka standar Java (Swing, AWT) yang disertakan dalam JDK.

Instalasi

Kloning repositori:git clone https://github.com/<nama-pengguna-anda>/<nama-repositori>.git


Buka proyek di IDE pilihan Anda:
Jika menggunakan NetBeans, buka proyek langsung untuk memanfaatkan file .form.
Untuk IDE lain, impor file Java dan pastikan paket apparab dipertahankan.


Kompilasi dan jalankan AppArabSatu.java untuk meluncurkan aplikasi GUI.

Penggunaan

Jalankan aplikasi dengan mengeksekusi AppArabSatu.java.
Masukkan teks Arab di kolom teks input (tfInput).
Klik tombol Hapus Harakat untuk menghapus tanda baca; hasilnya muncul di area teks sebelah kiri (taHapusHarakat).
Klik tombol Pemisah Lafadz untuk memisahkan teks menjadi kata-kata; hasilnya muncul di area teks sebelah kanan (taPisahLafadz).
Untuk menguji penghapusan tanda baca di konsol, jalankan percobaan.java.

Contoh
Input: َلْكَلِمَةُ الْعَرَبِيَّة

Keluaran Hapus Harakat: لكلمة العربية
Keluaran Pemisah Lafadz:لكلمة
العربية



Masalah yang Diketahui

Logika Hapus Harakat: Metode btHapusHarakatActionPerformed di AppArabSatu.java salah menambahkan karakter ke string input (text += c). Ini harus diperbaiki dengan menggunakan string keluaran terpisah, misalnya:StringBuilder result = new StringBuilder();
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
    if (c != 'َ' && c != 'ِ' && c != 'ُ' && c != 'ْ') {
        result.append(c);
    }
}
taHapusHarakat.setText(result.toString());


Pemisah Lafadz: Metode ini berfungsi dengan benar tetapi dapat menangani kasus khusus (misalnya, banyak spasi, input kosong) dengan lebih baik.
percobaan.java: Logika baris baru tidak relevan dan dapat dihapus atau dimodifikasi untuk pemisahan kata yang sebenarnya.

Peningkatan di Masa Depan

Perbaiki logika penghapusan tanda baca di AppArabSatu.java untuk keluaran yang benar.
Tambahkan validasi input untuk menangani input kosong atau tidak valid dengan baik.
Tingkatkan tata letak GUI untuk penyelarasan dan responsivitas yang lebih baik.
Perluas percobaan.java untuk menduk

