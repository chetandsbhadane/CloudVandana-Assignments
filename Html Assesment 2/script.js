function submitForm() {
    const firstName = document.getElementById('first-name').value;
    const lastName = document.getElementById('last-name').value;
    const dateOfBirth = document.getElementById('date-of-birth').value;
    const country = document.getElementById('country').value;
    const gender = document.querySelectorAll('input[name="gender"]:checked');
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobile = document.getElementById('mobile').value;

    if (gender.length === 0) {
        alert('Please select a gender.');
        return;
    }

    const resultsList = document.getElementById('results-list');
    resultsList.innerHTML = '';
    resultsList.innerHTML += `<li><strong>First Name:</strong> ${firstName}</li>`;
    resultsList.innerHTML += `<li><strong>Last Name:</strong> ${lastName}</li>`;
    resultsList.innerHTML += `<li><strong>Date of Birth:</strong> ${dateOfBirth}</li>`;
    resultsList.innerHTML += `<li><strong>Country:</strong> ${country}</li>`;
    resultsList.innerHTML += `<li><strong>Gender:</strong> ${gender[0].value}</li>`;
    resultsList.innerHTML += `<li><strong>Profession:</strong> ${profession}</li>`;
    resultsList.innerHTML += `<li><strong>Email:</strong> ${email}</li>`;
    resultsList.innerHTML += `<li><strong>Mobile Number:</strong> ${mobile}</li>`;

    document.getElementById('popup').style.display = 'block';
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
    document.getElementById('survey-form').reset();
}

function resetForm() {
    document.getElementById('survey-form').reset();
}
