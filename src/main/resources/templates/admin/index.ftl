<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">

	<#--边栏sidebar-->
	<#include "../common/nav.ftl">

	<#--主要内容content-->
	<div id="page-content-wrapper">
		<div class="container-fluid">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<form role="form" method="post" action="/sell/admin/save">
						<div class="form-group">
							<label>Name</label>
							<input name="username" type="text" class="form-control"
								   value="${(category.username)!''}"/>
						</div>
						<div class="form-group">
							<label>Password</label>
							<input name="password" type="text" class="form-control"
								   value="${(category.password)!''}"/>
						</div>
						<div class="form-group">
							<label>Phone</label>
							<input name="phone" type="text" class="form-control"
								   value="${(category.phone)!''}"/>
						</div>
						<input hidden type="text" name="sellerId"
							   value="${(category.sellerId)!''}">
						<button type="submit" class="btn btn-default">Submit</button>
					</form>
				</div>
			</div>
		</div>
	</div>

</div>
</body>
</html>