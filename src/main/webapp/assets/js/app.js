function openTab(idx) {
  const tabs = document.querySelectorAll(".tab-content");
  const btns = document.querySelectorAll(".tab");

  btns.forEach((tab, i) => {
    tab.classList.toggle('active', i === idx);
    tabs[i].classList.toggle('active', i === idx);
  });
}

openTab(0)