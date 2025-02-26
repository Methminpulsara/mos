

all();

function all (){
    const items = document.getElementById("items");

    const requestOptions = {
        method: "GET",
      };
    
      fetch("http://localhost:8080/product/getAll", requestOptions)
        .then((response) => response.json())
        .then((data) => {data.forEach(data => {
            items.innerHTML += `
              <div class="product-card">
                <div class="product-image-container">
                  <img src="@" alt="Classic Royale Burger" class="product-image">
                </div>
                <div class="product-info">
                  <h3 class="product-title">${data.name}</h3>
                  <p class="product-price">Rs : ${data.price}</p>
                  <p class="product-desc">Discount : ${data.discount} %</p>
                  <div class="product-footer">
                    
                    <button class="add-cart">Add</button>
                  </div>
                </div>
              </div>
            `;
          });
        });
}