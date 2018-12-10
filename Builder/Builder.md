# Builder Pattern
- 複雑な構成物を、その部品から組み上げていくことで構築しようと言うアプローチ。
	- 当たり前の感もする。
- `Builder`が実際に作る人。土方。
- `Director`が現場監督。`Builder`に直接の指示を出す。
- `Client`が`Director`と`Builder`を作り出して`Director`に仕事を依頼する。すると`Director`が良しなに計らってくれて、`Builder`が働く。
	- ドカタと現場監督のデベロッパー会社社員とクライアントみたいなもの。