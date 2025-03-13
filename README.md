# Sistem Manajemen Inventaris

## Deskripsi Proyek
Sistem Manajemen Inventaris adalah aplikasi berbasis Java yang dikembangkan menggunakan NetBeans. Sistem ini bertujuan untuk membantu perusahaan dalam mengelola stok barang dengan lebih efisien.

Sistem ini mencakup empat master utama:
1. **Barang** - Untuk mengelola data barang yang tersedia dalam inventaris.
2. **Transaksi** - Untuk mencatat proses keluar-masuk barang.
3. **User** - Untuk mengelola pengguna sistem dengan hak akses yang berbeda.
4. **Laporan** - Untuk menyusun dan melihat laporan terkait inventaris.

## Fitur Utama
- **Manajemen Barang**: Menambah, mengedit, dan menghapus data barang dalam sistem.
- **Manajemen Transaksi**: Mencatat transaksi masuk dan keluar barang.
- **Manajemen User**: Mengelola pengguna dan hak aksesnya.
- **Laporan Inventaris**: Menyediakan laporan terkait stok barang dan transaksi.

## Hak Akses Pengguna
Sistem ini memiliki empat jenis pengguna dengan otoritas berbeda:
1. **Administrator**:
   - Memiliki akses penuh ke semua master (Barang, Transaksi, User, dan Laporan).
2. **Pengelola Barang**:
   - Dapat mengelola master Barang dan Transaksi.
3. **Supervisor**:
   - Hanya dapat melihat master Barang, Transaksi, dan Laporan tanpa mengelolanya.
4. **Karyawan**:
   - Hanya dapat mengelola master Laporan.

## Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java
- **IDE**: NetBeans
- **Database**: MySQL
- **Framework GUI**: Swing

## Cara Menjalankan Proyek
1. **Clone repositori ini**:
   ```bash
   git clone https://github.com/winterestingwithyou/tes.git
   ```
2. **Buka NetBeans** dan pilih "Open Project".
3. **Konfigurasi Database**:
   - Import database yang telah disediakan.
   - Sesuaikan koneksi database dalam kode program.
4. **Jalankan Program** melalui NetBeans.

## Kontributor
- **Winterest** (Pengembang Utama)

## Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE).

