<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
<head>

<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">

<title>Register</title>
</head>
<body>
	<main class="container">
		<header class="row">
			<div class="alert alert-success col">
				<h1>Đăng Ký</h1>
			</div>

		</header>
		<section class="row">
			<div class="col-7">
				<div class="row">
					<div class="col">
						<form action="${pageContext.request.contextPath}/RegisterServlet" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<label for="username">Tên Đăng Nhập:</label> <input type="text"
									id="username" name="username" class="form-control" />
							</div>

							<div class="form-group">
								<label for="password">Mật Khẩu:</label> <input type="password"
									name="password" id="password" class="form-control" />
							</div>
							<div class="form-group">
								<label for="dateOfBirth">Ngày Sinh</label>
								<input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" />
								 
							</div>
							<div class="custom-file mb-4">
								<label for="image" class="custom-file-label">Hình</label>
								<input type="file" class="custom-file-input" id="image" name="image" />
							</div>
							<div class="form-group">
								<label >Giới Tính:</label>
								<div class="form-check form-check-inline">
									<input type="radio" class="form-check-input" id="genderM" name="gender" value="true" checked /> 
									<label for="genderM">Nam</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="radio" class="form-check-input" id="genderF" name="gender" value="false" /> 
									<label for="genderF">Nữ</label>
								</div>
							</div>
							<div class="form-group">
								<div class="form-check">
									<input type="checkbox" name="married" class="form-check-input"
										id="married" value="true" /> 
									<label for="married">Đã có gia đình?</label>
								</div>
							</div>
							<div class="form-group">
								<label for="nationality">Quốc Tịch:</label> <select
									name="nationality" id="nationality" class="form-control">
									<option value="vi">Việt Nam</option>
									<option value="us">Mỹ</option>
									<option value="jp">Nhật Bản</option>
								</select>
							</div>
							<div class="form-group">
								<label >Sở Thích: </label>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check form-check-input"
										name="favorites" id="read" value="Read" /> 
									<label
										for="read">Đọc Sách</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check form-check-input"
										name="favorites" id="music" value="Music" /> 
									<label
										for="music">Âm Nhạc</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check form-check-input"
										name="favorites" id="tourist" value="Tourist" /> <label
										for="tourist">Du Lịch</label>
								</div>
								<div class="form-check form-check-inline">
									<input type="checkbox" class="form-check form-check-input"
										name="favorites" id="others" value="others" /> <label
										for="others">Khác</label>
								</div>
							</div>
							<div class="form-group">
								<label for="note">Ghi Chú:</label>
								<textarea name="note" id="note" rows="3" class="form-control"></textarea>
							</div>
							<hr />
							<button type="submit" class="btn btn-primary">Đăng ký</button>
						</form>
					</div>
				</div>
			</div>

			<div class="col-5">
				<h3>Thông tin đã được đăng ký</h3>
				<ul>
					<li>
						<img src="uploads/${staff.imageName }" alt="" class="img-fluid" width="260" />
					</li>
					<li>Tên đăng nhập: ${ staff.username }</li>
					<li>Mật Khẩu: ${ staff.password }</li>
					<li>Giới Tính: ${ staff.gender ? 'Nam' : 'Nữ' }</li>
					<li>Lập gia đình: ${ staff.married ? 'Đã lập gia đình' : 'Chưa lập gia đình' }</li>
					<li>Quốc Tịch: ${ staff.nationality }</li>
					<li>Sở thích: 
					
							
								${ favorites }
							
						
					</li>
					<li>Ghi chú: ${ staff.note }</li>
				</ul>
			</div>

		</section>

	</main>
	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
	<script>
		// Add the following code if you want the name of the file appear on select
		$(".custom-file-input").on(
				"change",
				function() {
					var fileName = $(this).val().split("\\").pop();
					$(this).siblings(".custom-file-label").addClass("selected")
							.html(fileName);
				});
	</script>

</body>
</html>