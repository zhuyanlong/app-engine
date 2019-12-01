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
					<table class="table table-bordered table-condensed">
						<thead>
						<tr>
							<th>CategoryId</th>
							<th>Name</th>
							<th>Password</th>
							<th>Phone</th>
							<th>CreateTime</th>
							<th>ModifyTime</th>
							<th>Operation</th>
						</tr>
						</thead>
						<tbody>

						<#list categoryList as category>
							<tr>
								<td>${category.sellerId}</td>
								<td>${category.username}</td>
								<td>${category.password}</td>
								<td>${category.phone}</td>
								<td>${category.createTime}</td>
								<td>${category.updateTime}</td>
								<td><a href="/sell/admin/index?sellerId=${category
									.sellerId}">Modify</a></td>
							</tr>
						</#list>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

</div>
</body>
</html>