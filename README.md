# Reference book

## Step 1

### Bands reference
- **Band Name** (text)
- **Formation Date** (date)
- **Number of Members** (integer)
- **Most Popular Album** (reference to the Albums Reference)

### Albums Reference:

- **Album Title** (text)
- **Release Date** (date)
- **Number of Tracks** (integer)
- **Sales** (fixed-point number)

## Step 2

1. MySQL
2. music schema
    ![image](https://github.com/egerrmann/reference-book/assets/70744445/74c3b16a-6175-460f-aa13-43615c43d45f)
    ```
    CREATE TABLE album (
    album_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    release_date DATE NOT NULL,
    number_of_tracks INT NOT NULL,
    sales DECIMAL(8, 3) NOT NULL);
    ```
    ```
    CREATE TABLE band (
    band_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    formation_date DATE NOT NULL,
    number_of_members INT NOT NULL,
    most_popular_album INT UNIQUE,
    FOREIGN KEY (most_popular_album) REFERENCES album(album_id));
    ```
3. Filling with data
    ```
    INSERT INTO album (title, release_date, number_of_tracks, sales)
    VALUES ("Black holes and revelations", STR_TO_DATE('19-06-2006', '%d-%m-%Y'), 12, 4500.000),
    ("Hybrid theory", STR_TO_DATE('24-10-2000', '%d-%m-%Y'), 12, 27000.000),
    ("Audioslave", STR_TO_DATE('17-11-2002', '%d-%m-%Y'), 14, 7000.000);
    ```
    ```
    INSERT INTO band (name, formation_date, number_of_members, most_popular_album)
    VALUES ("Muse", STR_TO_DATE('01-01-1994', '%d-%m-%Y'), 3, 1),
    ("Audioslave", STR_TO_DATE('01-01-2001', '%d-%m-%Y'), 4, 3),
    ("Linkin Park", STR_TO_DATE('01-01-1996', '%d-%m-%Y'), 9, 2);
    ```


