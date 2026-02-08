
package com.designpattern.smartlibrarymanagement;

//User interface extending Observer
interface User extends Observer {
	void showRole(); // Display user role

	void reserveBook(String bookName); // Reserve a book
}
