
Trong Java, **kiểu dữ liệu (Data Type)** cho biết một biến sẽ lưu loại dữ liệu gì và cần bao nhiêu bộ nhớ.

```
Kiểu dữ liệu
├── Primitive (nguyên thủy) - Biến chứa giá trị
│   ├── byte - 8 bit | -128 -> 127
│   ├── short - 16 bit | -32.768 -> 32.767
│   ├── int - 32 bit | +- 2.1 tỷ
│   ├── long - 64 bit | rất lớn
│   ├── float - 32 bit | số thực
│   ├── double - 64 bit | số thực chính xác hơn
│   ├── char - 16 bit | Unicode
│   └── boolean - phụ thuộc JVM | true/false
│
└── Reference (tham chiếu) - Biến chứa tham chiếu đến một object
    ├── String
    ├── Array
    ├── Class
    ├── Object
    └── Interface...
```



### Ép kiểu (Casting)
- Chuyển một giá trị từ kiểu dữ liệu này sang kiểu dữ liệu khác.
	- Tự động (Widening)
	- Tường minh (Narrowing)

- ### Tự động
- Khi chuyển từ kiểu có phạm vi nhỏ sang kiểu có phạm vi lớn hơn, Java thường tự động chuyển.
- ```
	int a = 10;
	double b = a; 
	
	System.out.println(b);
  ```
- Kết quả: 10.0
- byte → short → int → long → float → double

- ### Tường minh
- Khi chuyển từ kiểu lớn sang kiểu nhỏ, phải chỉ rõ kiểu muốn chuyển.
- ```
	double price = 19.99;
	int x = (int) price;
	
	System.out.println(x);
  ```
- Kết quả: 19

- ### Char sang số
- ```
	char c = 'A';
	int x = c;
	
	System.out.println(x);
  ```
- Kết quả: 65
